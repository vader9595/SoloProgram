package com.NicksWorld.SoloProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoloProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoloProgramApplication.class, args);

		BoardGames boardGames = new TheThing();
		System.out.println(boardGames.getName());
	}

}
