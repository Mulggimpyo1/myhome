package kr.aplat.myhome.repository;

import kr.aplat.myhome.models.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long> {

    List<Board> findByTitle(String title);
    List<Board> findBytitleOrContent(String title, String content);
}
