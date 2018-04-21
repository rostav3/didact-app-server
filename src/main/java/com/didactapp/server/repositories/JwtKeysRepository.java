package com.didactapp.server.repositories;

import com.didactapp.server.domain.JwtKeys;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by jt on 9/24/17.
 */
@Transactional
public interface JwtKeysRepository extends CrudRepository<JwtKeys, String> {
}