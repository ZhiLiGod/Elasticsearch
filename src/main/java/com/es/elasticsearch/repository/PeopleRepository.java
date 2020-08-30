package com.es.elasticsearch.repository;

import com.es.elasticsearch.entity.People;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PeopleRepository extends ElasticsearchRepository<People, Long> {

  List<People> findAllByName(String name);

}
