package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ProductDTO;
import com.multi.frame.MyService;
import com.multi.mapper.ProductMapper;

@Service
public class ProductService implements MyService<Integer, ProductDTO> {

	@Autowired
	ProductMapper mapper;
	
	@Override
	public void register(ProductDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(ProductDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public ProductDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ProductDTO> get() throws Exception {
		return mapper.selectall();
	}

}
