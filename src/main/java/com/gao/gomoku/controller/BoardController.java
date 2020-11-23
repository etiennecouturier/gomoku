package com.gao.gomoku.controller;

interface BoardController {

    void init();

    void cancel();

    boolean determineWinner();

    void attemptMove();

}
