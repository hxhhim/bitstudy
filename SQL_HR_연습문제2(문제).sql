/****** HR ����Ÿ ��ȸ ����2 ****************
/*1�� HR �μ��� � ����� �޿������� ��ȸ�ϴ� ������ �ð� �ִ�. 
  Tucker ��� ���� �޿��� ���� �ް� �ִ� ����� 
  �̸��� ��(Name���� ��Ī), ����, �޿��� ����Ͻÿ�
*****************************************************/

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,JOB_ID,SALARY
FROM EMPLOYEES WHERE salary>(SELECT SALARY
FROM EMPLOYEES WHERE last_NAME='Tucker') ORDER BY SALARY DESC;

SELECT SALARY
FROM EMPLOYEES WHERE last_NAME='Tucker';
--tucker�� �޿��� ���ϴ� sql


/*2�� ����� �޿� ���� �� ������ �ּ� �޿��� �ް� �ִ� ����� 
  �̸��� ��(Name���κ�Ī), ����, �޿�, �Ի����� ����Ͻÿ�
********************************************************/
SELECT SALARY
FROM EMPLOYEES ;

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,,hire_date
FROM EMPLOYEES  ;

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,JOB_ID,SALARY,hire_date
FROM EMPLOYEES where salary=(select min(SALARY) from employees) ;

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,JOB_ID,SALARY,hire_date
FROM EMPLOYEES where (salary,job_id)in(SELECT min(SALARY),job_id
FROM EMPLOYEES GROUP BY job_id) ;




/*3�� �Ҽ� �μ��� ��� �޿����� ���� �޿��� �޴� ����� 
  �̸��� ��(Name���� ��Ī), �޿�, �μ���ȣ, ������ ����Ͻÿ�
***********************************************************/
SELECT round(avg(salary)),department_id
from employees
group by department_id;

SELECT e.FIRST_NAME||' '||e.LAST_NAME AS NAME,e.SALARY,e.department_id,e.job_id
from employees e ,(SELECT round(avg(salary)) f ,department_id from employees group by department_id) a
where e.salary > f and e.department_id = a.department_id
;



/*4�� ��� ����� �ҼӺμ� ��տ����� ����Ͽ� ������� �̸��� ��(Name���� ��Ī),
  ����, �޿�, �μ���ȣ, �μ���տ���(Department Avg Salary�� ��Ī)�� ����Ͻÿ�
***************************************************************/
SELECT round(avg(salary*12*(nvl(commission_pct,0)+1))) ,department_id
from employees
group by department_id;

SELECT e.FIRST_NAME||' '||e.LAST_NAME AS NAME, job_id, salary, e.department_id, f.ravg 
from employees e,(SELECT round(avg(salary)) ravg ,department_id from employees group by department_id)f 
where e.department_id=f.department_id order by ravg desc;

SELECT e.FIRST_NAME||' '||e.LAST_NAME AS NAME, job_id, salary, e.department_id, f.ravg 
from employees e,(SELECT round(avg(salary*12*(nvl(commission_pct,0)+1))) ravg ,department_id from employees group by department_id)f 
where e.department_id=f.department_id order by ravg desc;

/*5�� HR ��Ű���� �ִ� Job_history ���̺��� ������� ���� ���� �̷��� ��Ÿ���� ���̺��̴�. 
  �� ������ �̿��Ͽ� ��� ����� ���� �� ������ ���� �̷� ������ ����ϰ��� �Ѵ�. 
  �ߺ��� ��������� ������ �� ���� ǥ���Ͽ� ����Ͻÿ�
  (�����ȣ, ����)
*********************************************************************/
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,e.employee_id,e.job_id from employees e
union 
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,j.employee_id,j.job_id from employees e,job_history j 
where e.employee_id=j.employee_id;



/*6�� �� �������� �� ����� ���� �̷� ������ Ȯ���Ͽ���. 
  ������ '��� ����� ���� �̷� ��ü'�� ������ ���ߴ�. 
  ���⿡���� ��� ����� ���� �̷� ���� ����(JOB_HISTORY) �� 
  �������濡 ���� �μ������� �����ȣ�� ���� ������� ����Ͻÿ�
  (���տ����� UNION Ȱ�� : �����ȣ, �μ���ȣ, ���� ���� ���)
**********************************************************************/
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,e.employee_id,e.job_id from employees e 
union all
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,j.employee_id,j.job_id from employees e,job_history j 
where e.employee_id=j.employee_id order by employee_id ;

  
/*7�� HR �μ������� �ű� ������Ʈ�� �������� �̲� �ش� �����ڵ��� 
  �޿��� �λ� �ϱ�� �����Ͽ���. 
  ����� ���� 107���̸� 19���� ������ �ҼӵǾ� �ٹ� ���̴�. 
  �޿� �λ� ����ڴ� ȸ���� ����(Distinct job_id) �� ���� 5�� �������� 
  ���ϴ� ����� �ش�ȴ�. ������ ������ ���ؼ��� �޿��� ����ȴ�. 
  5�� ������ �޿� �λ���� ������ ����.
  HR_REP(10%), MK_REP(12%), PR_REP(15%), SA_REP(18%), IT_PROG(20%)
**********************************************************************/

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,JOB_ID,SALARY
,CASE WHEN JOB_ID='HR_REP' THEN SALARY*1.1
      WHEN JOB_ID='MK_REP' THEN SALARY*1.12
      WHEN JOB_ID='PR_REP' THEN SALARY*1.15
      WHEN JOB_ID='SA_REP' THEN SALARY*1.18
      WHEN JOB_ID='IT_PROG' THEN SALARY*1.2
      ELSE SALARY
      END AS SALARY
FROM employees
;



/*8�� HR �μ������� �ֻ��� �Ի��Ͽ� �ش��ϴ� 2001����� 2003����� �Ի��ڵ��� �޿��� 
  ���� 5%, 3%, 1% �λ��Ͽ� ���п� ���� �������� �����ϰ��� �Ѵ�. 
  ��ü ����� �� �ش� �⵵�� �ش��ϴ� ������� �޿��� �˻��Ͽ� �����ϰ�, 
  �Ի����ڿ� ���� �������� ������ �����Ͻÿ�
**********************************************************************/
SELECT FIRST_NAME||' '||LAST_NAME AS NAME, HIRE_DATE ,SALARY EX
,CASE WHEN   '010101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='011231' THEN ROUND(SALARY*1.05)
      WHEN   '020101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='021231' THEN ROUND(SALARY*1.03)
      WHEN   '030101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='031231' THEN ROUND(SALARY*1.01)
    ELSE SALARY
    END AS SALARY
    
FROM EMPLOYEES
ORDER BY HIRE_DATE ;


/*9�� �μ��� �޿� �հ踦 ���ϰ�, �� ����� ������ ���� ǥ���Ͻÿ�.
  Sum Salary > 100000 �̸�, "Excellent"
  Sum Salary > 50000 �̸�, "Good"
  Sum Salary > 10000 �̸�, "Medium"
  Sum Salary <= 10000 �̸�, "Well"
**********************************************************************/
SELECT F.DEPARTMENT_NAME,F.DEPARTMENT_ID
FROM DEPARTMENTS F,EMPLOYEES E
WHERE f.department_id=E.DEPARTMENT_ID
;


SELECT E.DEPARTMENT_ID,SUM(Salary)  
,CASE WHEN SUM(Salary)>100000 THEN 'Excellent'
      WHEN SUM(Salary)>50000 THEN 'Good'
      WHEN SUM(Salary)>10000 THEN 'Medium'
      WHEN SUM(Salary)<=10000 THEN 'well'
      END  AS SUMSAL
FROM EMPLOYEES E 
GROUP BY DEPARTMENT_ID;

SELECT E.DEPARTMENT_ID,SUM(Salary),F.DEPARTMENT_NAME  
,CASE WHEN SUM(Salary)>100000 THEN 'Excellent'
      WHEN SUM(Salary)>50000 THEN 'Good'
      WHEN SUM(Salary)>10000 THEN 'Medium'
      WHEN SUM(Salary)<=10000 THEN 'well'
      END  AS SUMSAL
FROM EMPLOYEES E
JOIN DEPARTMENTS F 
ON E.department_id=F.DEPARTMENT_ID
GROUP BY E.DEPARTMENT_ID,F.DEPARTMENT_NAME
;

SELECT E.DEPARTMENT_ID,SUM(Salary),F.DEPARTMENT_NAME  
,CASE WHEN SUM(Salary)>100000 THEN 'Excellent'
      WHEN SUM(Salary)>50000 THEN 'Good'
      WHEN SUM(Salary)>10000 THEN 'Medium'
      WHEN SUM(Salary)<=10000 THEN 'well'
      END  AS SUMSAL
FROM EMPLOYEES E,DEPARTMENTS F
WHERE E.department_id=F.DEPARTMENT_ID
GROUP BY E.DEPARTMENT_ID,F.DEPARTMENT_NAME
;


/*10�� 2005�� ������ �Ի��� ��� �� ������ "MGR"�� ���Ե� ����� 15%, 
  "MAN"�� ���Ե� ����� 20% �޿��� �λ��Ѵ�. 
  ���� 2005����� �ٹ��� ������ ��� �� "MGR"�� ���Ե� ����� 25% �޿��� �λ��Ѵ�. 
  �̸� �����ϴ� ������ �ۼ��Ͻÿ�
**********************************************************************/



/*11�� ������ �Ի��� ��� �� ���
  (���1) ������ �Ի��� ��� ���� �Ʒ��� ���� �� �ະ�� ��µǵ��� �Ͻÿ�(12��).
  1�� xx
  2�� xx
  3�� xx
  ..
  12�� xx
  �հ� XXX
**********************************************************************/  
---------------------------------------------------------
/* (���2) ù �࿡ ��� ���� �Ի� ��� ���� ��µǵ��� �Ͻÿ�
  1�� 2�� 3�� 4�� .... 11�� 12��
  xx  xx  xx xx  .... xx   xx
**********************************************************************/







