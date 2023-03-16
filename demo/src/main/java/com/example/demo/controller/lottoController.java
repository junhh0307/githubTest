package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lotto")
public class lottoController {


	@GetMapping()
	public String lotto(Model model) {

		Map<String, String> mapA = new HashMap<String, String>();

		return "lotto";
	}



	@PostMapping("/new")
	public String newLotto(Model model) {

		System.out.println("new  nefddwddd");

		List<String> listA = new ArrayList<String>();
		Map<String, String> mapA = new HashMap<String, String>();

		Random random = new Random();
		int[] arr = new int[6];
		System.out.println("dddddd       "   + arr.length);

		for( int i = 0; i <= arr.length-1; i++ ) {
			int cnt = 0;

			cnt = random.nextInt(44);
			arr[i] = cnt + 1;

			for ( int j = 0; j < i; j++ ) {
				if ( arr[j] == arr[i] ) {
					i = i - 1;
					break;
				}
			}

			mapA.put( "lotto_0" + Integer.toString(i), Integer.toString(arr[i]) );
		}

		model.addAttribute("mapA", mapA);

		return "redirect:/lotto";
	}

}
