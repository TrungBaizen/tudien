package com.example.tudien.service;

import com.example.tudien.model.DictionaryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DictionaryService {
    private final List<DictionaryModel> dictionaryModelList = new ArrayList<>();
    public DictionaryService(){
        dictionaryModelList.add(new DictionaryModel("hello","xin chào"));
        dictionaryModelList.add(new DictionaryModel("goodbye","tạm biệt"));
        dictionaryModelList.add(new DictionaryModel("love","yêu"));
        dictionaryModelList.add(new DictionaryModel("cook","đầu bếp"));
        dictionaryModelList.add(new DictionaryModel("apple","quả táo"));
        dictionaryModelList.add(new DictionaryModel("class","lớp"));
        dictionaryModelList.add(new DictionaryModel("school","trường"));
        dictionaryModelList.add(new DictionaryModel("book","sách"));
        dictionaryModelList.add(new DictionaryModel("pen","bút"));
    }
    public List<DictionaryModel> getAll(){
        return dictionaryModelList;
    }
}
