package com.sippulse.soapadapter.adapter;


import com.sippulse.soapadapter.client.didWS.Did;
import com.sippulse.soapadapter.client.didWS.DidWS;
import com.sippulse.soapadapter.client.didWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.didWS.WSException;
import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DidClientAdapter {
    private final DidWS didWS;
    private final SipPulseAuthMapper authMapper;

    public DidClientAdapter(DidWS didWS, SipPulseAuthMapper authMapper) {
        this.didWS = didWS;
        this.authMapper = authMapper;
    }

    public Integer insertDid(Did did){
        try{
            return didWS.insertDid(did,authMapper.toSoapUser(UserPrincipalDTO::new));
        }catch (WSException e){
            throw new RuntimeException("Erro ao inserir DID", e);
        }
    }

    public List<String> listAvailablesNumbers(String domain){
        try {
            return didWS.listAvailablesNumbers(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao buscar números disponíveis", e);
        }
    }

    public List<DidDTO> listByAcc(String accountCode){
        try{
            return DidDTO.fromEntityList(
                    didWS.listByAcc(
                            accountCode,
                            authMapper.toSoapUser(UserPrincipalDTO::new)
                    )
            );

        }catch (WSException e){
            throw new RuntimeException("Erro ao buscar DIDs", e);
        }
    }

    public void deleteDid(Integer didId ) {

        try{

            didWS.deleteDid(
                    didId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );

        }catch (WSException e){
            throw new RuntimeException("Erro ao deletar did", e);
        }
    }
}
