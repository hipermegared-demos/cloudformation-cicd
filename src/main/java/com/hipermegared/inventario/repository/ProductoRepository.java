package com.hipermegared.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hipermegared.inventario.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
