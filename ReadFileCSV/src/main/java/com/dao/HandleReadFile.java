package com.dao;

import java.io.IOException;
import java.util.List;

public abstract class HandleReadFile<T> {
    private List<T> data;
    public final void readFileCSV(String strPath) throws IOException {
        this.data = readFile(strPath);
        processFile(this.data);
    }

    protected abstract List<T> readFile(String strPath);
    protected void processFile(List<T> content) {}
}
