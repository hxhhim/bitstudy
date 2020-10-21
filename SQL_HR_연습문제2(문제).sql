/****** HR 데이타 조회 문제2 ****************
/*1■ HR 부서의 어떤 사원은 급여정보를 조회하는 업무를 맡고 있다. 
  Tucker 사원 보다 급여를 많이 받고 있는 사원의 
  이름과 성(Name으로 별칭), 업무, 급여를 출력하시오
*****************************************************/

SELECT FIRST_NAME||' '||LAST_NAME AS NAME,JOB_ID,SALARY
FROM EMPLOYEES WHERE salary>(SELECT SALARY
FROM EMPLOYEES WHERE last_NAME='Tucker') ORDER BY SALARY DESC;

SELECT SALARY
FROM EMPLOYEES WHERE last_NAME='Tucker';
--tucker의 급여를 구하는 sql


/*2■ 사원의 급여 정보 중 업무별 최소 급여를 받고 있는 사원의 
  이름과 성(Name으로별칭), 업무, 급여, 입사일을 출력하시오
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




/*3■ 소속 부서의 평균 급여보다 많은 급여를 받는 사원의 
  이름과 성(Name으로 별칭), 급여, 부서번호, 업무를 출력하시오
***********************************************************/
SELECT round(avg(salary)),department_id
from employees
group by department_id;

SELECT e.FIRST_NAME||' '||e.LAST_NAME AS NAME,e.SALARY,e.department_id,e.job_id
from employees e ,(SELECT round(avg(salary)) f ,department_id from employees group by department_id) a
where e.salary > f and e.department_id = a.department_id
;



/*4■ 모든 사원의 소속부서 평균연봉을 계산하여 사원별로 이름과 성(Name으로 별칭),
  업무, 급여, 부서번호, 부서평균연봉(Department Avg Salary로 별칭)을 출력하시오
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

/*5■ HR 스키마에 있는 Job_history 테이블은 사원들의 업무 변경 이력을 나타내는 테이블이다. 
  이 정보를 이용하여 모든 사원의 현재 및 이전의 업무 이력 정보를 출력하고자 한다. 
  중복된 사원정보가 있으면 한 번만 표시하여 출력하시오
  (사원번호, 업무)
*********************************************************************/
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,e.employee_id,e.job_id from employees e
union 
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,j.employee_id,j.job_id from employees e,job_history j 
where e.employee_id=j.employee_id;



/*6■ 위 문제에서 각 사원의 업무 이력 정보를 확인하였다. 
  하지만 '모든 사원의 업무 이력 전체'를 보지는 못했다. 
  여기에서는 모든 사원의 업무 이력 변경 정보(JOB_HISTORY) 및 
  업무변경에 따른 부서정보를 사원번호가 빠른 순서대로 출력하시오
  (집합연산자 UNION 활용 : 사원번호, 부서번호, 업무 정보 출력)
**********************************************************************/
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,e.employee_id,e.job_id from employees e 
union all
SELECT  FIRST_NAME||' '||LAST_NAME AS NAME,j.employee_id,j.job_id from employees e,job_history j 
where e.employee_id=j.employee_id order by employee_id ;

  
/*7■ HR 부서에서는 신규 프로젝트를 성공으로 이끈 해당 업무자들의 
  급여를 인상 하기로 결정하였다. 
  사원은 현재 107명이며 19개의 업무에 소속되어 근무 중이다. 
  급여 인상 대상자는 회사의 업무(Distinct job_id) 중 다음 5개 업무에서 
  일하는 사원에 해당된다. 나머지 업무에 대해서는 급여가 동결된다. 
  5개 업무의 급여 인상안은 다음과 같다.
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



/*8■ HR 부서에서는 최상위 입사일에 해당하는 2001년부터 2003년까지 입사자들의 급여를 
  각각 5%, 3%, 1% 인상하여 지분에 따른 배당금으로 지급하고자 한다. 
  전체 사원들 중 해당 년도에 해당하는 사원들의 급여를 검색하여 적용하고, 
  입사일자에 따른 오름차순 정렬을 수행하시오
**********************************************************************/
SELECT FIRST_NAME||' '||LAST_NAME AS NAME, HIRE_DATE ,SALARY EX
,CASE WHEN   '010101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='011231' THEN ROUND(SALARY*1.05)
      WHEN   '020101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='021231' THEN ROUND(SALARY*1.03)
      WHEN   '030101'<= TO_CHAR(HIRE_DATE,'YYMMDD')AND TO_CHAR(HIRE_DATE,'YYMMDD')<='031231' THEN ROUND(SALARY*1.01)
    ELSE SALARY
    END AS SALARY
    
FROM EMPLOYEES
ORDER BY HIRE_DATE ;


/*9■ 부서별 급여 합계를 구하고, 그 결과를 다음과 같이 표현하시오.
  Sum Salary > 100000 이면, "Excellent"
  Sum Salary > 50000 이면, "Good"
  Sum Salary > 10000 이면, "Medium"
  Sum Salary <= 10000 이면, "Well"
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


/*10■ 2005년 이전에 입사한 사원 중 업무에 "MGR"이 포함된 사원은 15%, 
  "MAN"이 포함된 사원은 20% 급여를 인상한다. 
  또한 2005년부터 근무를 시작한 사원 중 "MGR"이 포함된 사원은 25% 급여를 인상한다. 
  이를 수행하는 쿼리를 작성하시오
**********************************************************************/



/*11■ 월별로 입사한 사원 수 출력
  (방식1) 월별로 입사한 사원 수가 아래와 같이 각 행별로 출력되도록 하시오(12행).
  1월 xx
  2월 xx
  3월 xx
  ..
  12월 xx
  합계 XXX
**********************************************************************/  
---------------------------------------------------------
/* (방식2) 첫 행에 모든 월별 입사 사원 수가 출력되도록 하시오
  1월 2월 3월 4월 .... 11월 12월
  xx  xx  xx xx  .... xx   xx
**********************************************************************/







