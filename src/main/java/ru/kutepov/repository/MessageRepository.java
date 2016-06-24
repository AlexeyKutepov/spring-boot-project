package ru.kutepov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kutepov.entity.Message;

import java.util.List;

@Repository(value = "MessageRepository")
public interface MessageRepository extends JpaRepository<Message, Long> {

  @Query("FROM MESSAGE where id like %?1% ")
  List<Message> findById(Integer id);

}
