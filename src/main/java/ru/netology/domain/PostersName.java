package ru.netology.domain;

import lombok.Data;

@Data

public class PostersName {

    private String posterName;

    public PostersName() {
    }

    public PostersName(String posterName) {
        this.posterName = posterName;
    }  ///sgsdgsdgsdg

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }
}
