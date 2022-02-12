package hello.aop.exam;

import hello.aop.exam.annotation.Retry;
import hello.aop.exam.annotation.Trace;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExamService {

    private final ExamRepository examRepository;

//    @Trace
    @Retry(4)
    public void request(String itemId) {
        examRepository.save(itemId);
    }


}