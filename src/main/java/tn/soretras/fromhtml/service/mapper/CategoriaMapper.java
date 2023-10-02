package tn.soretras.fromhtml.service.mapper;

import org.mapstruct.*;
import tn.soretras.fromhtml.domain.Categoria;
import tn.soretras.fromhtml.service.dto.CategoriaDTO;

/**
 * Mapper for the entity {@link Categoria} and its DTO {@link CategoriaDTO}.
 */
@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntityMapper<CategoriaDTO, Categoria> {}
