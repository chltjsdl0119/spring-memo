package org.sparta.memo.repository;

import org.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    List<Memo> findAllByUsername(String username);

    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}
