package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

    @Test
    public void joiningStrings() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"

        StringBuilder join = new StringBuilder();


        for (String name : names) {
            join.append(name.toUpperCase().charAt(0)).append(name.substring(1));
            if (!name.equals(names.get(names.size()-1))) {
                join.append(", ");
            }
        }
        System.out.println(join);
    }

    @Test
    public void joiningStringsWithStream() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"
        String join = names.stream().map(n -> n.substring(0, 1).toUpperCase() + n.substring(1)).collect(Collectors.joining(", "));
        System.out.println(join);

    }

}
