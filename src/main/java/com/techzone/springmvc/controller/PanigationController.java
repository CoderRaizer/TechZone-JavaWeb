package com.techzone.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techzone.springmvc.entity.Product;
import com.techzone.springmvc.repository.ProductRepository;
import com.techzone.springmvc.service.ProductService;

//@Controller
//@RequestMapping("api/ajax")
public class PanigationController {

//	private static int indexPage = 0;
//	private static int sizePage = 5;
//	private int sizeList;
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	@Autowired
//	private ProductService productService;
//
//	@GetMapping("/listProduct")
//	public String listProductPanigation(ModelMap theModel) {
//
//		Pageable pageCustoms = PageRequest.of(indexPage,sizePage);
//
//		Page<Product> pageProducts = productRepository.findAll(pageCustoms);
//
//		sizeList = productService.getProducts().size();
//
//		theModel.addAttribute("indexPage", indexPage);
//		theModel.addAttribute("totalPage",(int) Math.floor(sizeList / sizePage));
//		
//		theModel.addAttribute("products", pageProducts.getContent());
//		
//		return "/panigation/list-product";
//
//	}
//	
//
//	@RequestMapping(value = "/actionPage")
//	public String handleActionNextAndPrev(@RequestParam("action") String action, ModelMap theModel) {
//
//		if (action.equalsIgnoreCase("next")) {
//
//			int totalPages = (int) Math.floor(sizeList / sizePage);
//
//			if (indexPage < totalPages) {
//
//				indexPage++;
//				int newIndex = indexPage;
//				Pageable pageCustoms = PageRequest.of(newIndex, sizePage);
//				Page<Product> allProducts = productRepository.findAll(pageCustoms);
//				theModel.addAttribute("products", allProducts.getContent());
//			}
//			else {
//				Pageable pageCustoms = PageRequest.of(indexPage, sizePage);
//				Page<Product> allProducts = productRepository.findAll(pageCustoms);
//				theModel.addAttribute("products", allProducts.getContent());
//			}
//
//		}
//
//		if (action.equalsIgnoreCase("prev")) {
//
//			if (indexPage > 0) {
//
//				indexPage--;
//				int newIndex = indexPage;
//				Pageable pageMe = PageRequest.of(newIndex, sizePage);
//				Page<Product> allProducts = productRepository.findAll(pageMe);
//				theModel.addAttribute("products", allProducts.getContent());
//
//			} else {
//				Pageable pageMe = PageRequest.of(0, sizePage);
//				Page<Product> allProducts = productRepository.findAll(pageMe);
//				theModel.addAttribute("products", allProducts.getContent());
//			}
//		}
//		
//		theModel.addAttribute("indexPage", indexPage);
//		theModel.addAttribute("totalPage",(int) Math.floor(sizeList / sizePage));
//		
//		return "/panigation/list-product";
//
//	}
//	
//	
//	@RequestMapping(value = "/goPageIndex")
//	public String handleGoPageIndex(@RequestParam("index") int index, ModelMap theModel) {
//
//		
//		Pageable pageCustoms = PageRequest.of(index, sizePage);
//		Page<Product> allProducts = productRepository.findAll(pageCustoms);
//		theModel.addAttribute("products", allProducts.getContent());
//		indexPage = index;
//		theModel.addAttribute("indexPage", indexPage);
//		theModel.addAttribute("totalPage",(int) Math.floor(sizeList / sizePage));
//		
//		return "/panigation/list-product";
//
//	}

} // END CLASS
