//TDRUNSTA JOB MSGCLASS=H,MSGLEVEL=(1,1),REGION=0M,NOTIFY=&SYSUID.
//*               -----------------------                           //
//* DB2V11.JUN2915.SDSNEXIT
//* RUNSTATS
//*
//STEP1 EXEC PGM=DSNUTILB,PARM='DB94,STAA1',DYNAMNBR=25
//STEPLIB DD DISP=SHR,DSN=DB2V11.JUN2915.SDSNEXIT
//SYSUT1   DD UNIT=SYSDA,SPACE=(CYL,(600,50))
//SORTWK01 DD UNIT=SYSDA,SPACE=(CYL,(600,50))
//SORTWK02 DD UNIT=SYSDA,SPACE=(CYL,(600,50))
//SORTWK03 DD UNIT=SYSDA,SPACE=(CYL,(600,50))
//SORTWK04 DD UNIT=SYSDA,SPACE=(CYL,(600,50))
//SYSREC   DD UNIT=SYSDA,SPACE=(CYL,(599,49))
//SYSPRINT DD SYSOUT=*
//UTPRINT  DD SYSOUT=*
//SYSUDUMP DD SYSOUT=*
//SYSIN DD *
 RUNSTATS TABLESPACE TRADE.TRADETS1 INDEX ALL  TABLE ALL REPORT YES
 RUNSTATS TABLESPACE TRADE.TRADETS2 INDEX ALL  TABLE ALL REPORT YES
 RUNSTATS TABLESPACE TRADE.TRADETS3 INDEX ALL  TABLE ALL REPORT YES
 RUNSTATS TABLESPACE TRADE.TRADETS4 INDEX ALL  TABLE ALL REPORT YES
 RUNSTATS TABLESPACE TRADE.TRADETS5 INDEX ALL  TABLE ALL REPORT YES
 RUNSTATS TABLESPACE TRADE.TRADETS6 INDEX ALL  TABLE ALL REPORT YES
