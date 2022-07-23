package ru.netology.manager;

import ru.netology.domain.PostersName;

public class Manager {

    private PostersName[] posters = new PostersName[0];
    private int maxPosters = 10;

    public Manager() {
    }

    public Manager(int maxPosters) {
        this.maxPosters = maxPosters;
    }

    public void newPoster(PostersName poster) {
        PostersName[] tmp = new PostersName[posters.length + 1];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public void findAll() {
        PostersName[] tmp = new PostersName[posters.length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        posters = tmp;
        return;
    }

    public PostersName[] getPosters() {
        return posters;
    }



    public PostersName[] findLast() {
        int results;
        if (posters.length > maxPosters) {
            results = maxPosters;
        } else {
            results = posters.length;
        }
        PostersName[] reversed = new PostersName[results];
        for (int i = 0; i < results; i++) {
            reversed[i] = posters[posters.length - i - 1];
        }
        return reversed;
    }
}