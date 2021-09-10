--입력테스트
insert into temp values(temp_seq.nextVal,20,21,19,18,23,24);
--테이블 정보
select * from temp;
--롤백
rollback;