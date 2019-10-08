package co.edu.usbcali.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class OperacionesMatematicas {

	@GetMapping("/suma/{n1}/{n2}")
	public Resultado sumar(@PathVariable("n1") Integer numeroUno, @PathVariable("n2") Integer numeroDos) {
		return new Resultado(numeroUno + numeroDos);
	}
	
	@GetMapping("/resta/{n1}/{n2}")
	public Resultado resta(@PathVariable("n1") Integer numeroUno, @PathVariable("n2") Integer numeroDos) {
		return new Resultado(numeroUno - numeroDos);
	}

	class Resultado {

		public Resultado(Integer valor) {
			super();
			this.valor = valor;
		}

		private Integer valor;

		public Integer getValor() {
			return valor;
		}

		public void setValor(Integer valor) {
			this.valor = valor;
		}

	}
}
