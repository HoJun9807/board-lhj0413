package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
