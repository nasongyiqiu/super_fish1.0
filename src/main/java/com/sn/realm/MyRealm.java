package com.sn.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


public class MyRealm extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
	/*	String no = (String) token.getPrincipal();
		
		User user = uDao.findByNo(no);
		
		if (user == null) {
			throw new UnknownAccountException();
		}
		
		String password = user.getPassword();
		
		SimpleAuthenticationInfo infos = new SimpleAuthenticationInfo(no, password,this.getName());
		
		return infos;*/

		return null;
	}

}
