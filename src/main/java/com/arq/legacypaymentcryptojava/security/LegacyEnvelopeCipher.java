package com.arq.legacypaymentcryptojava.security;
import javax.crypto.Cipher;
public class LegacyEnvelopeCipher { public Cipher cipher() throws Exception { return Cipher.getInstance("DESede/ECB/PKCS5Padding"); } }
