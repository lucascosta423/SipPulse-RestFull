package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.whitelistWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WhitelistClientAdapter {

    private final WhiteListWS whiteListWS;
    private final SipPulseAuthMapper authMapper;

    public WhitelistClientAdapter(WhiteListWS whiteListWS, SipPulseAuthMapper authMapper) {
        this.whiteListWS = whiteListWS;
        this.authMapper = authMapper;
    }

    public List<UserWhiteList> listWhiteList(String username, String domain, UserPrincipalDTO principal) {
        try {
            return whiteListWS.listWhiteList(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar whitelist", e);
        }
    }

    public Integer insertWhiteList(UserWhiteList whiteList, UserPrincipalDTO principal) {
        try {
            return whiteListWS.insertWhiteList(
                    whiteList,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao inserir whitelist", e);
        }
    }

    public void deleteWhiteList(Integer whiteListId, UserPrincipalDTO principal) {
        try {
            whiteListWS.deletetWhiteList(
                    whiteListId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao deletar whitelist", e);
        }
    }
}
