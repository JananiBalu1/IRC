package com.example.day3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.model.IPL;
import com.example.day3.repository.IPLrepo;


@Service
public class IPLservice {
@Autowired
public IPLrepo irepo;
public IPL saveInfo(IPL im)
{
	return irepo.save(im);
}
}
