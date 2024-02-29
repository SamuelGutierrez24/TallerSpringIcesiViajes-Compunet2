package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class TipoDestinoTest {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    @Test
    void debeRetornarListaTiposDestinos(){

        List<TipoDestino> lstTipoDestino= tipoDestinoService.findAll();

        for(TipoDestino tipoDestino: lstTipoDestino){
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

    @Test
    void debeRetornarUnTipoDestino(){
        Integer id = 3;
        Optional<TipoDestino> resultado = tipoDestinoService.findById(id);
        assertEquals(id, resultado.get().getIdTide());
        assertEquals("BOSQU", resultado.get().getCodigo());

    }
    @Test
    void debeGuardarUnTipoDestino() throws Exception {
        TipoDestino tipoDestino = new TipoDestino();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hoy = dateFormat.parse("2024-02-27");

        tipoDestino.setIdTide(10);
        tipoDestino.setCodigo("MON");
        tipoDestino.setNombre("Montaña");
        tipoDestino.setDescripcion("Destino que cuenta con Montaña, paisajes y Frio");
        tipoDestino.setFechaCreacion(hoy);
        tipoDestino.setUsuCreador("samu");
        tipoDestino.setEstado("A");

        TipoDestino montaña = tipoDestinoService.save(tipoDestino);

        Optional<TipoDestino> tipoDestino1 = tipoDestinoService.findById(10);

        assertEquals(tipoDestino.getIdTide(),tipoDestino1.get().getIdTide());
    }
    @Test
    void debesModificarUnTipoDestino() throws Exception {
        TipoDestino tipoDestino = new TipoDestino();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hoy = dateFormat.parse("2024-02-27");

        tipoDestino.setIdTide(10);
        tipoDestino.setCodigo("Ri");
        tipoDestino.setNombre("Rio");
        tipoDestino.setDescripcion("Destino con rio y paseo en barca");
        tipoDestino.setFechaCreacion(hoy);
        tipoDestino.setUsuCreador("samu");
        tipoDestino.setEstado("A");

        TipoDestino montaña = tipoDestinoService.update(tipoDestino);

        Optional<TipoDestino> tipoDestino1 = tipoDestinoService.findById(10);

        assertEquals("Rio",tipoDestino1.get().getNombre());
    }
    @Test
    void debeEliminarUnTipoDestino() throws Exception {

        TipoDestino tipoDestino = new TipoDestino();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hoy = dateFormat.parse("2024-02-27");
        tipoDestino.setIdTide(12);
        tipoDestino.setCodigo("MONA");
        tipoDestino.setNombre("Montañaa");
        tipoDestino.setDescripcion("Destino que cuenta con Montaña y paisajes");
        tipoDestino.setFechaCreacion(hoy);
        tipoDestino.setUsuCreador("samu");
        tipoDestino.setEstado("A");
        TipoDestino montaña = tipoDestinoService.save(tipoDestino);


        Optional<TipoDestino> tipoDestino1 = tipoDestinoService.findById(12);
        tipoDestinoService.delete(tipoDestino1.get());

        Optional<TipoDestino> tipoDestino2 = tipoDestinoService.findById(12);

        assertFalse(tipoDestino2.isPresent());
    }
    @Test
    void debeEliminarUnTipoDestinoId() throws Exception {

        TipoDestino tipoDestino = new TipoDestino();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hoy = dateFormat.parse("2024-02-27");

        tipoDestino.setIdTide(11);
        tipoDestino.setCodigo("Ri");
        tipoDestino.setNombre("Rioo");
        tipoDestino.setDescripcion("Destino con rio y paseo en barca");
        tipoDestino.setFechaCreacion(hoy);
        tipoDestino.setUsuCreador("samu");
        tipoDestino.setEstado("A");

        TipoDestino rio = tipoDestinoService.save(tipoDestino);

        Optional<TipoDestino> tipoDestino1 = tipoDestinoService.findById(11);
        tipoDestinoService.deleteById(tipoDestino1.get().getIdTide());

        Optional<TipoDestino> tipoDestino2 = tipoDestinoService.findById(11);

        assertTrue(tipoDestino2.isEmpty());

    }

    @Test
    void debeContarLasFilasDeLaBD(){
        assertEquals(tipoDestinoService.findAll().size(),tipoDestinoService.count());
    }


}
