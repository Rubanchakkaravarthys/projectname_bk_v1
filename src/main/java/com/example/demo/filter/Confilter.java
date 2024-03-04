package com.example.demo.filter;
import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
	

	
	@Component
	@Order
	public class Confilter implements Filter {
	     @Override
	        public void init(FilterConfig filterConfig) throws ServletException {
	            // No initialization required
	        }

	        @Override
	        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
	            HttpServletResponse response = (HttpServletResponse) servletResponse;
	            response.setHeader("Access-Control-Allow-Origin", "*");
	            response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
	            response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	            filterChain.doFilter(servletRequest, servletResponse);
	        }

	        @Override
	        public void destroy() {
	            // No cleanup required
	        }
	}

