package examples;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
//@SessionScope(proxyMode = ScopedProxyMode.INTERFACES)
@Scope(proxyMode = ScopedProxyMode.DEFAULT)
public class SessionScopedUserService implements UserService {

}
