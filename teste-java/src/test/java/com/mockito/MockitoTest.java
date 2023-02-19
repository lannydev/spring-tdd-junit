package com.mockito;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @Test
    public void primeiroTesteMockito(){
        List<String> lista = Mockito.mock(ArrayList.class);
        Mockito.when(lista.size() ).thenReturn(3);
        lista.add("Elaine");
        lista.add("Diegos");
        lista.add("Lara");

        int size = lista.size();

        Assertions.assertThat(size).isEqualTo(3);
    }
}
