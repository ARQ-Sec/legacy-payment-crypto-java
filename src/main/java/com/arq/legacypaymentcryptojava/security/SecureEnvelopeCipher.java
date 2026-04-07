package com.arq.legacypaymentcryptojava.security;
import javax.crypto.Cipher;
public class SecureEnvelopeCipher { public Cipher cipher() throws Exception { return Cipher.getInstance("AES/GCM/NoPadding"); } }
