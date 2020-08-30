package com.es.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Data
@Document(indexName = "people", type = "man")
public class People {

  @Id
  @Field(type = FieldType.Long)
  private Long id;

  @Field(type = FieldType.Text)
  private String name;

  @Field(type = FieldType.Keyword)
  private String country;

  @Field(type = FieldType.Date)
  private LocalDateTime date;

}
