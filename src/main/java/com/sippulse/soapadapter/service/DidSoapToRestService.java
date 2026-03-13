package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.sippulse.client.didWS.Did;
import com.sippulse.soapadapter.sippulse.client.didWS.DidWS;
import com.sippulse.soapadapter.sippulse.client.didWS.UserPrincipalDTO;
import com.sippulse.soapadapter.sippulse.client.didWS.WSException;
import com.sippulse.soapadapter.sippulse.mapper.SipPulseAuthMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DidSoapToRestService {

    private final DidWS didWS;
    private final SipPulseAuthMapper authMapper;

    public DidSoapToRestService(DidWS didWS, SipPulseAuthMapper authMapper) {
        this.didWS = didWS;
        this.authMapper = authMapper;
    }

    public Integer insertDid(DidDTO did){

        try{

            Did didSoap = new Did();

            BeanUtils.copyProperties(did,didSoap);

            return didWS.insertDid(didSoap,authMapper.toSoapUser(UserPrincipalDTO::new));

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
