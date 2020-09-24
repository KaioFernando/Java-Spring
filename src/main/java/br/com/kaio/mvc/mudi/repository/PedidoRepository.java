package br.com.kaio.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kaio.mvc.mudi.model.Pedido;
import br.com.kaio.mvc.mudi.model.StatusPedidoType;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedidoType status);
	
}
