package labDev.AluguelCarros.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import labDev.AluguelCarros.dto.AutomovelDto;
import labDev.AluguelCarros.form.AutomovelForm;
import labDev.AluguelCarros.form.AutomovelFormAtualizacao;
import labDev.AluguelCarros.model.Automovel;
import labDev.AluguelCarros.repository.AutomovelRepository;

@Controller
@RequestMapping("/automovel")
public class AutomovelController {

	@Autowired
	private AutomovelRepository automovelRepo;

	@GetMapping("/novo")
	public String automovelForm() {
		return "automovelForm";
	}
	
	@GetMapping("/all")
	@ResponseBody
	public List<AutomovelDto> getAll(){
		List<Automovel> automoveis = automovelRepo.findAll();
		List<AutomovelDto> automoveisDto = automoveis.stream().map(i -> new AutomovelDto(i)).toList();
		
		return automoveisDto;
		
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity getAutomovelById(@PathVariable("id") Long id){
		Optional<Automovel> automovel = automovelRepo.findById(id);
		if(automovel.isPresent()) {
			return new ResponseEntity(new AutomovelDto(automovel.get()), HttpStatus.CREATED);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/novo")
	@ResponseBody
	@Transactional
	public AutomovelDto criarAutomovel(@RequestBody AutomovelForm form) {

		Automovel automovel = this.automovelRepo.save(new Automovel(form));
		
		return new AutomovelDto(automovel);
	}

	@DeleteMapping("/remover/{id}")
	@Transactional
	public ResponseEntity removerAutomovelById(@PathVariable("id") Long id) {
		try {			
			automovelRepo.deleteById(id);
			return ResponseEntity.ok().build();
		} catch(Exception e) {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	@PutMapping("/atualizar/{id}")
	@Transactional
	public ResponseEntity atualizarAutomovelById(@PathVariable("id") Long id, @RequestBody @Valid AutomovelFormAtualizacao form) {
		Automovel automovel = form.atualizar(id,automovelRepo);
		if(!automovel.equals(null)) {
			return ResponseEntity.ok(new AutomovelDto(automovel));
		}
		return ResponseEntity.badRequest().build();
		
	}
	
	
}
