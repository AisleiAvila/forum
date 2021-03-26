package br.com.dasad.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dasad.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
