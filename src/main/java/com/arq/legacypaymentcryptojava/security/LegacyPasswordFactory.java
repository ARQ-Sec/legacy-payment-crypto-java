package com.arq.legacypaymentcryptojava.security;
import javax.crypto.SecretKeyFactory;
public class LegacyPasswordFactory { public SecretKeyFactory factory() throws Exception { return SecretKeyFactory.getInstance("PBEWithMD5AndDES"); } }
