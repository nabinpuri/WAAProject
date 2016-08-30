package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Post;
import com.mum.repository.*;
import com.mum.services.PostService;
@Service
@Transactional
public class PostServiceImpl implements PostService{
	@Autowired
	PostRepository postRepository;
	public List<Post> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Post getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Post entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(Post entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
