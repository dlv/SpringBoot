package br.com.douglas.trilha.lancamento.controller;

import br.com.douglas.trilha.lancamento.model.ContasMensais;
import br.com.douglas.trilha.lancamento.model.enums.TipoLancamento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author douglas
 */
@RestController
@RequestMapping("/api")
public class LancamentoController {

    @RequestMapping(path = "/incluir",method=RequestMethod.GET)
    public ContasMensais greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new ContasMensais(Integer.SIZE, name, Double.NaN, TipoLancamento.EDUCACAO);
    }
}
