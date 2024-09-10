package com.sparta.basicspringsession6.repository;

import com.sparta.basicspringsession6.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
