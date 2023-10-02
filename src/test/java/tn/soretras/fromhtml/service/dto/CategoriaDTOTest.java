package tn.soretras.fromhtml.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import tn.soretras.fromhtml.web.rest.TestUtil;

class CategoriaDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(CategoriaDTO.class);
        CategoriaDTO categoriaDTO1 = new CategoriaDTO();
        categoriaDTO1.setId("id1");
        CategoriaDTO categoriaDTO2 = new CategoriaDTO();
        assertThat(categoriaDTO1).isNotEqualTo(categoriaDTO2);
        categoriaDTO2.setId(categoriaDTO1.getId());
        assertThat(categoriaDTO1).isEqualTo(categoriaDTO2);
        categoriaDTO2.setId("id2");
        assertThat(categoriaDTO1).isNotEqualTo(categoriaDTO2);
        categoriaDTO1.setId(null);
        assertThat(categoriaDTO1).isNotEqualTo(categoriaDTO2);
    }
}
