package org.example.hexlet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MainPage {
    public Boolean visited;

    public Boolean isVisited() {
        return visited;
    }
}