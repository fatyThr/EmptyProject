package com.example.emptyproject.infrastructure.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagination<T>{
    private List<T> content;
    private int page;
    private int size;
    private long totalPages;
    private long totalElements;

}
