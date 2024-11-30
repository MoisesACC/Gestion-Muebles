package com.muebleria.service.impl;

import com.muebleria.entity.Mueble;
import com.muebleria.repository.MuebleRepository;
import com.muebleria.service.MuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuebleServiceImpl implements MuebleService {

    @Autowired
    private MuebleRepository muebleRepository;

    @Override
    public List<Mueble> listarMuebles() {
        return muebleRepository.findAll();
    }

    @Override
    public Mueble guardarMueble(Mueble mueble) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ccc9a1fe8fb111e26b307c6259eaaa1b86c5a488
        if (mueble.getId() != null) {
            // Si el mueble tiene un ID, lo actualizamos
            Mueble muebleExistente = muebleRepository.findById(mueble.getId()).orElse(null);
            if (muebleExistente != null) {
                // Actualizamos los campos con los nuevos valores
                muebleExistente.setNombre(mueble.getNombre());
                muebleExistente.setPrecio(mueble.getPrecio());
                muebleExistente.setDescripcion(mueble.getDescripcion());
                muebleExistente.setImagen(mueble.getImagen());
                // Guardamos el mueble actualizado
                return muebleRepository.save(muebleExistente);
            }
        }
        // Si no tiene ID, lo guardamos como un nuevo mueble
        return muebleRepository.save(mueble);
    }

<<<<<<< HEAD
=======

=======
        return muebleRepository.save(mueble);
    }

>>>>>>> bcf8fd40bb68b8960587a3fce46128abd0ac81cb
>>>>>>> ccc9a1fe8fb111e26b307c6259eaaa1b86c5a488
    @Override
    public Mueble obtenerMueblePorId(Long id) {
        return muebleRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarMueble(Long id) {
        muebleRepository.deleteById(id);
    }
}
