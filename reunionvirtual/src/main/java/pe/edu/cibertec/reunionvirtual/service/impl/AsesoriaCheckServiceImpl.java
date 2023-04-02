package pe.edu.cibertec.reunionvirtual.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.reunionvirtual.model.AsesoriaCheck;
import pe.edu.cibertec.reunionvirtual.repo.IAsesoriaCheckRepo;
import pe.edu.cibertec.reunionvirtual.service.IAsesoriaCheckService;
import java.util.Date;

@Service
public class AsesoriaCheckServiceImpl implements IAsesoriaCheckService {
    @Autowired
    private IAsesoriaCheckRepo asesoriaCheckRepo;
    public boolean crearLink(Integer idAsesoria, String link) {
        asesoriaCheckRepo.save(
                AsesoriaCheck.builder()
                        .idAsesoria(idAsesoria)
                        .link(link)
                        .fechaCreacion(new Date())
                        .build()
        );
        return false;
    }

}
