/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidade.Piada;
import entidade.PiadaDAO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiadaController {
    
    
    @CrossOrigin(origins = "http://editor.swagger.io")
    @RequestMapping(method = RequestMethod.POST,
                    value="/piada")
    public Piada salvarPiada(@RequestBody Piada p){
        PiadaDAO dao = new PiadaDAO();
        Piada piadaSalva = dao.salvar(p);
        return piadaSalva;
    }
    
}
