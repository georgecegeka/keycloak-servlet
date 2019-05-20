package feed;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.representations.AccessToken;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

public class PermissionChecker {

    public static boolean hasUserAccess(String roleName, HttpServletRequest request) {
        KeycloakPrincipal principal = (KeycloakPrincipal) request.getUserPrincipal();
        AccessToken token = principal.getKeycloakSecurityContext().getToken();
        Set<String> grantedRoles = token.getRealmAccess().getRoles();
        return grantedRoles.contains(roleName);
    }
}
