package edu.etime.ssmtest.services.interfaces;

import edu.etime.ssmtest.pojo.test;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author：yjh
 * @date：2019/10/18 19:43
 */
@Service
public interface TestService {
    List<test> selectTestList(test test);
}
