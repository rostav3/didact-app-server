package com.didactapp.server.services;

import com.didactapp.server.api.v1.model.UserDTO;

/**
 * Created by jt on 9/26/17.
 */
public interface AuthenticationService {
    String getNewPublicKey();
    Object signup(UserDTO userDTO);


}
