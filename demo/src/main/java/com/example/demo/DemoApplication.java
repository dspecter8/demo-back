package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CategoryRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Category;
import com.example.demo.entities.Product;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		categoryRepository.save(new Category(null,"Computer",null,null,null));
		categoryRepository.save(new Category(null,"printers",null,null,null));
		categoryRepository.save(new Category(null,"Smart Phones",null,null,null));
	
		Random rnd = new Random();
		
		categoryRepository.findAll().forEach(c->{
			for(int i=0; i<10; i++) {
				Product p = new Product();
				p.setName(RandomString.make(18));
				p.setCurrentprice(100+rnd.nextInt(10000));
				p.setAvailable(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setSelected(rnd.nextBoolean());
				p.setCategory(c);
				p.setPhotoName("unknow.JPEG");
				productRepository.save(p);
			}

		});
	}

}
