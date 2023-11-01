package educa.api.repository;

import educa.api.request.domain.Conteudo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {

    Page<Conteudo> findByTitulo(String titulo, Pageable paginacao);

    Page<Conteudo> findByUsuarioIdUsuario(int id, Pageable paginacao);

    Page<Conteudo> findByTituloAndUsuarioIdUsuario(String titulo, int id, Pageable paginacao);

}
